drop database if exists select_test;
create database select_test;
use select_test;
# Ϊ�˱�֤�ӱ���յ�������ڣ�ͨ��Ӧ���Ƚ�����
create table teacher_table
(
	# auto_increment:ʵ���ϴ����������ݿ���Զ���Ų��ԣ�ͨ���������ݱ���߼�������
	teacher_id int auto_increment,
	teacher_name varchar(255),
	primary key(teacher_id)
);
create table student_table
(
	# Ϊ����������Լ��
	student_id int auto_increment primary key,
	student_name varchar(255),
	# ָ��java_teacher���յ�teacher_table��teacher_id��
	java_teacher int,
	foreign key(java_teacher) references teacher_table(teacher_id)
);
insert into teacher_table
values
(null , 'Yeeku');
insert into teacher_table
values
(null , 'Leegang');
insert into teacher_table
values
(null , 'Martine');
insert into student_table
values
(null , '����' , 1);
insert into student_table
values
(null , '����' , 1);
insert into student_table
values
(null , '����' , 1);
insert into student_table
values
(null , '����' , 2);
insert into student_table
values
(null , '_����' , 2);

insert into student_table
values
(null , null , 2);
insert into student_table
values
(null , '����' , null);


