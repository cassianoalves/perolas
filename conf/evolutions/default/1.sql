# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table perola (
  id                        bigint not null,
  texto                     varchar(255),
  autor                     varchar(255),
  constraint pk_perola primary key (id))
;

create sequence perola_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists perola;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists perola_seq;

