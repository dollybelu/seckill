CREATE database seckill;

use seckill;

create table seckill(
seckill_id bigint not null auto_increment comment '��Ʒ���id',
name varchar(120) not null comment'��Ʒ����',
number  int not null comment '�������',
start_time timestamp not null comment '��ɱ����ʱ��',
end_time timestamp not null comment '��ɱ����ʱ��',
create_time timestamp not null DEFAULT CURRENT_TIMESTAMP comment'����ʱ��',
primary key (seckill_id),
key idx_start_time(start_time),
key ide_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='��ɱ���ݿ�';

insert into seckill(name, number, start_time, end_time) values
('1000Ԫ��ɱС��8',100,'2018-7-11 00:00:00', "2018-7-11 23:59:59"),
('300Ԫ��ɱС��5',200,'2018-7-11 00:00:00', "2018-7-11 23:59:59"),
('100Ԫ��ɱ����3',300,'2018-7-11 00:00:00', "2018-7-11 23:59:59"),
('500Ԫ��ɱ����note',400,'2018-7-11 00:00:00', "2018-7-11 23:59:59");



create table success_killed(
seckill_id bigint not null comment '��ɱ��Ʒid',
user_phone bigint not null comment '�û��ֻ���',
state tinyint not null default -1 comment'״̬��ʶ��-1����Ч 0���ɹ� 1���Ѹ���',
create_time timestamp not null comment'����ʱ��',
primary key(seckill_id, user_phone),
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ɱ�ɹ���ϸ��';

mysql -uroot -p

