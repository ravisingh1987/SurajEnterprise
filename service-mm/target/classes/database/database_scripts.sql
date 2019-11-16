CREATE TABLE user_master (
  user_id NUMERIC  NOT NULL  ,
  first_name VARCHAR(45)  NULL  ,
  last_name VARCHAR(45)  NULL  ,
  dob DATE  NULL  ,
  gender VARCHAR(6)  NULL  ,
  district INT  NULL  ,
  address VARCHAR(250)  NULL  ,
  postcode VARCHAR(12)  NULL  ,
  telephone VARCHAR(12)  NULL  ,
  bio TEXT(150)  NULL  ,
  user_type VARCHAR(30)  NULL  ,
  user_name VARCHAR(45)  NULL  ,
  email VARCHAR(50)  NULL  ,
  user_password VARCHAR(250)  NULL  ,
  salt VARCHAR(100)  NULL  ,
  lost_pass_token VARCHAR(200)  NULL  ,
  lost_pass_expiry DATETIME  NULL  ,
  last_login DATETIME  NULL  ,
  last_login_ip VARCHAR(30)  NULL  ,
  registered_id VARCHAR(30)  NULL  ,
  active BOOL  NULL  ,
  activated_date DATETIME  NULL  ,
  user_desc VARCHAR(1000)  NULL  ,
  created_by VARCHAR(45)  NULL  ,
  updated_by VARCHAR(45)  NULL  ,
  created_date DATETIME  NULL  ,
  updated_date DATETIME  NULL    ,
PRIMARY KEY(user_id));



CREATE TABLE unit_master (
  unit_id NUMERIC  NOT NULL   ,
  unit_name VARCHAR(45)  NULL  ,
  unit_desc VARCHAR(1000)  NULL  ,
  created_by VARCHAR(45)  NULL  ,
  updated_by VARCHAR(45)  NULL  ,
  created_date DATETIME  NULL  ,
  updated_date DATETIME  NULL  ,
  is_active VARCHAR(2)  NULL    ,
PRIMARY KEY(unit_id));



CREATE TABLE WORK (
  work_id NUMERIC  NOT NULL  ,
  user_master_user_id NUMERIC  NOT NULL  ,
  party_name VARCHAR(45)  NULL  ,
  issue_date DATETIME  NULL  ,
  top INTEGER UNSIGNED  NOT NULL  ,
  pant INTEGER UNSIGNED  NULL  ,
  size INTEGER UNSIGNED  NULL  ,
  qty INTEGER UNSIGNED  NULL  ,
  work_name VARCHAR(50)  NULL  ,
  work_desc VARCHAR(1000)  NULL  ,
  created_by VARCHAR(45)  NULL  ,
  updated_by VARCHAR(45)  NULL  ,
  created_date DATETIME  NULL  ,
  updated_date DATETIME  NULL  ,
  work_flag VARCHAR(2)  NULL    ,
PRIMARY KEY(work_id)  ,
INDEX work_FKIndex1(user_master_user_id),
  FOREIGN KEY(user_master_user_id)
    REFERENCES user_master(user_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE machine (
  machine_id NUMERIC  NOT NULL  ,
  user_master_user_id NUMERIC  NOT NULL  ,
  machine_name VARCHAR(45)  NULL  ,
  machine_qty INTEGER UNSIGNED  NULL  ,
  machine_desc VARCHAR(1000)  NULL  ,
  created_by VARCHAR(45)  NULL  ,
  updated_by VARCHAR(45)  NULL  ,
  created_date DATETIME  NULL  ,
  updated_date DATETIME  NULL  ,
  is_active VARCHAR(2)  NULL    ,
PRIMARY KEY(machine_id)  ,
INDEX machine_FKIndex1(user_master_user_id),
  FOREIGN KEY(user_master_user_id)
    REFERENCES user_master(user_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE capacity (
  capacity_id NUMERIC  NOT NULL  ,
  user_master_user_id NUMERIC  NOT NULL  ,
  machine_id NUMERIC  NOT NULL  ,
  capacity_value INTEGER UNSIGNED  NULL  ,
  capacity_desc VARCHAR(1000)  NULL  ,
  created_by VARCHAR(45)  NULL  ,
  updated_by VARCHAR(45)  NULL  ,
  created_date DATETIME  NULL  ,
  updated_date DATETIME  NULL  ,
  capacity_flag VARCHAR(2)  NULL    ,
PRIMARY KEY(capacity_id)  ,
INDEX capacity_FKIndex1(machine_id)  ,
INDEX capacity_FKIndex2(user_master_user_id),
  FOREIGN KEY(machine_id)
    REFERENCES machine(machine_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(user_master_user_id)
    REFERENCES user_master(user_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE payment (
  payment_id NUMERIC  NOT NULL  ,
  work_id NUMERIC  NOT NULL  ,
  user_master_user_id NUMERIC  NOT NULL  ,
  payment_value INTEGER UNSIGNED  NULL  ,
  payment_desc VARCHAR(1000)  NULL  ,
  paid INTEGER UNSIGNED  NULL  ,
  unpaid INTEGER UNSIGNED  NULL  ,
  total INTEGER UNSIGNED  NOT NULL  ,
  created_by VARCHAR(45)  NULL  ,
  updated_by VARCHAR(45)  NULL  ,
  created_date DATETIME  NULL  ,
  updated_date DATETIME  NULL  ,
  payment_flag VARCHAR(2)  NULL    ,
PRIMARY KEY(payment_id)  ,
INDEX payment_FKIndex1(user_master_user_id)  ,
INDEX payment_FKIndex2(work_id),
  FOREIGN KEY(user_master_user_id)
    REFERENCES user_master(user_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(work_id)
    REFERENCES WORK(work_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE priority (
  priority_id NUMERIC  NOT NULL  ,
  user_master_user_id NUMERIC  NOT NULL  ,
  work_id NUMERIC  NOT NULL  ,
  machine_id NUMERIC  NOT NULL  ,
  priority_all INTEGER UNSIGNED  NULL  ,
  non_prioritized INTEGER UNSIGNED  NULL  ,
  prioritized INTEGER UNSIGNED  NULL  ,
  priority_desc VARCHAR(1000)  NULL  ,
  created_by VARCHAR(45)  NULL  ,
  updated_by VARCHAR(45)  NULL  ,
  created_date DATETIME  NULL  ,
  updated_date DATETIME  NOT NULL    ,
PRIMARY KEY(priority_id)  ,
INDEX priority_FKIndex1(machine_id)  ,
INDEX priority_FKIndex2(work_id)  ,
INDEX priority_FKIndex3(user_master_user_id),
  FOREIGN KEY(machine_id)
    REFERENCES machine(machine_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(work_id)
    REFERENCES WORK(work_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(user_master_user_id)
    REFERENCES user_master(user_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE rate (
  rate_id NUMERIC  NOT NULL  ,
  unit_master_unit_id NUMERIC  NOT NULL  ,
  work_id NUMERIC  NOT NULL  ,
  machine_id NUMERIC  NOT NULL  ,
  rate_value INTEGER UNSIGNED  NULL  ,
  rate_desc VARCHAR(1000)  NULL  ,
  rate_unit_id INTEGER UNSIGNED  NULL  ,
  created_by VARCHAR(45)  NULL  ,
  updated_by VARCHAR(45)  NULL  ,
  created_date DATETIME  NULL  ,
  updated_date DATETIME  NULL  ,
  is_active VARCHAR(2)  NULL    ,
PRIMARY KEY(rate_id, unit_master_unit_id)  ,
INDEX rate_FKIndex1(unit_master_unit_id)  ,
INDEX rate_FKIndex2(machine_id)  ,
INDEX rate_FKIndex3(work_id),
  FOREIGN KEY(unit_master_unit_id)
    REFERENCES unit_master(unit_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(machine_id)
    REFERENCES machine(machine_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(work_id)
    REFERENCES WORK(work_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



