create schema if not exists public;
create schema if not exists test1;
create schema if not exists test2;

create table public.data(id bigint, value varchar(200));
create table test1.data(id bigint, value varchar(200));
create table test2.data(id bigint, value varchar(200));

CREATE SEQUENCE "public".hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
CREATE SEQUENCE "test1".hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
CREATE SEQUENCE "test2".hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

INSERT INTO public.data (id, value) VALUES (1, 'Public Tenant Data');
INSERT INTO test1.data (id, value) VALUES (1, 'First Tenant Data');
INSERT INTO test2.data (id, value) VALUES (1, 'Second Tenant Data');
