alter table public.users
    add role varchar(255) not null
        constraint users_role_check
            check ((role)::text = ANY
                   ((ARRAY ['ROLE_ADMIN'::character varying, 'ROLE_USER'::character varying])::text[])) default 'ROLE_USER';


