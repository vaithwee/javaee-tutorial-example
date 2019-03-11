use hibernate_crm
create table news_inf (
  id int auto_increment primary key,
  title varchar(255) not null ,
  content varchar(255),
  full_content varchar(255)
);
delimiter |
  create trigger t_full_content_gen before insert on news_inf
    for each row begin
      set new.full_content = concat(new.title, new.content);
  end
|
delimiter ;