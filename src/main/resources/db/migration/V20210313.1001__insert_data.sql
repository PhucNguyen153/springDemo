-- insert user
insert into staff(id, name, director) values (1, 'Nguyen Van A', true);
insert into staff(id, name, director) values (2, 'Nguyen Van B', false);
insert into staff(id, name, director) values (3, 'Nguyen Van C', false);
insert into staff(id, name, director) values (4, 'Nguyen Van D', false);
insert into staff(id, name, director) values (5, 'Nguyen Van E', false);
insert into staff(id, name, director) values (6, 'Nguyen Van F', false);
insert into staff(id, name, director) values (7, 'Nguyen Van G', false);
insert into staff(id, name, director) values (8, 'Nguyen Van H', false);

-- insert department
insert into department(id, name, department_manager_id) values (1, 'department 1', 2);
insert into department(id, name, department_manager_id) values (2, 'department 2', 3);

-- insert team
insert into team(id, name, department_id) values (1, 'team 1', 1);
insert into team(id, name, department_id) values (2, 'team 2', 1);
insert into team(id, name, department_id) values (3, 'team 3', 2);
insert into team(id, name, department_id) values (4, 'team 4', 2);

-- insert user_team
insert into user_team(id, user_id, team_id) values (1, 4, 1);
insert into user_team(id, user_id, team_id) values (2, 5, 1);
insert into user_team(id, user_id, team_id) values (3, 5, 2);
insert into user_team(id, user_id, team_id) values (4, 6, 2);
insert into user_team(id, user_id, team_id) values (5, 7, 3);
insert into user_team(id, user_id, team_id) values (6, 8, 4);

