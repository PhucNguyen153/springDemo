CREATE TABLE IF NOT EXISTS staff
(
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    director BOOLEAN DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS department
(
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    department_manager_id BIGINT NOT NULL,
    CONSTRAINT user_department_id_fk FOREIGN KEY(department_manager_id) REFERENCES staff(id)
);

CREATE TABLE IF NOT EXISTS team
(
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    department_id BIGINT NOT NULL,
    CONSTRAINT team_department_id_fk FOREIGN KEY(department_id) REFERENCES department(id)
);

CREATE TABLE IF NOT EXISTS user_team(
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL,
    team_id BIGINT NOT NULL,
    CONSTRAINT user_id_fk FOREIGN KEY(user_id) REFERENCES staff(id),
    CONSTRAINT team_id_fk FOREIGN KEY(team_id) REFERENCES team(id)
);


