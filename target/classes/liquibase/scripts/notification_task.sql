-- liquibase formatted sql

-- changeset Dpanteley:1
create table notification_task (
                                     notification_task_id serial primary key ,
                                     chat_id serial not null ,
                                     text_massage text not null ,
                                     schedule_date_time timestamp not null

);