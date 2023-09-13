-- liquibase formatted sql

-- changeset Dpanteley:1
create table notification_task(
                                  task_id serial primary key ,
                                  chat_id serial not null ,
                                  text_message text not null ,
                                  date_time timestamp not null
);