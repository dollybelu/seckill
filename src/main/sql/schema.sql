CREATE database seckill;

use seckill;

create table seckill(
seckill_id bigint not null auto_increment comment '商品库存id',
name varchar(120) not null comment'商品名称',
number  int not null comment '库存数量',
start_time timestamp not null comment '秒杀开启时间',
end_time timestamp not null comment '秒杀结束时间',
create_time timestamp not null DEFAULT CURRENT_TIMESTAMP comment'创建时间',
primary key (seckill_id),
key idx_start_time(start_time),
key ide_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀数据库';

insert into seckill(name, number, start_time, end_time) values
('1000元秒杀小米8',100,'2018-7-11 00:00:00', "2018-7-11 23:59:59"),
('300元秒杀小米5',200,'2018-7-11 00:00:00', "2018-7-11 23:59:59"),
('100元秒杀红米3',300,'2018-7-11 00:00:00', "2018-7-11 23:59:59"),
('500元秒杀红米note',400,'2018-7-11 00:00:00', "2018-7-11 23:59:59");



create table success_killed(
seckill_id bigint not null comment '秒杀商品id',
user_phone bigint not null comment '用户手机号',
state tinyint not null default -1 comment'状态标识，-1：无效 0：成功 1：已付款',
create_time timestamp not null comment'创建时间',
primary key(seckill_id, user_phone),
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';

mysql -uroot -p

