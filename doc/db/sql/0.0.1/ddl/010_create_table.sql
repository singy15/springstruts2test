-- Project Name : ss2t
-- Date/Time    : 2018/10/13 14:18:49
-- Author       : admin
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

-- c_version
drop table if exists c_version cascade;

create table c_version (
  db_version varchar not null
  , constraint c_version_PKC primary key (db_version)
) ;

-- t_customer
drop table if exists t_customer cascade;

create table t_customer (
  customer_id serial not null
  , name varchar(20) not null
  , constraint t_customer_PKC primary key (customer_id)
) ;

-- t_sale
drop table if exists t_sale cascade;

create table t_sale (
  sale_id serial not null
  , item_id bigint not null
  , amount integer not null
  , customer_id bigint not null
  , customer_name varchar(20) not null
  , constraint t_sale_PKC primary key (sale_id)
) ;

-- m_user
drop table if exists m_user cascade;

create table m_user (
  user_cd varchar(3) not null
  , name varchar(20) not null
  , constraint m_user_PKC primary key (user_cd)
) ;

-- t_item
drop table if exists t_item cascade;

create table t_item (
  item_id serial not null
  , name varchar(20) not null
  , price integer not null
  , constraint t_item_PKC primary key (item_id)
) ;

comment on table c_version is 'c_version';
comment on column c_version.db_version is 'db_version';

comment on table t_customer is 't_customer';
comment on column t_customer.customer_id is 'customer_id';
comment on column t_customer.name is 'name';

comment on table t_sale is 't_sale';
comment on column t_sale.sale_id is 'sale_id';
comment on column t_sale.item_id is 'item_id';
comment on column t_sale.amount is 'amount';
comment on column t_sale.customer_id is 'customer_id';
comment on column t_sale.customer_name is 'customer_name';

comment on table m_user is 'm_user';
comment on column m_user.user_cd is 'user_cd';
comment on column m_user.name is 'name';

comment on table t_item is 't_item';
comment on column t_item.item_id is 'item_id';
comment on column t_item.name is 'name';
comment on column t_item.price is 'price';

