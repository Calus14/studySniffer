create table studys (
          study_id uuid NOT NULL PRIMARY KEY,
          study_text char varying(255),
          study_summary char varying(255),
);