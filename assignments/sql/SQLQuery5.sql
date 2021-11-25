1
SELECT e.ename, d.loc 
from emp e join dept d
on e.deptno = d.DEPTNO
where d.loc='chicago';
select *from emp;
2
SELECT e.ename, d.loc 
from emp e join dept d
on e.deptno = d.DEPTNO
order by d.loc desc;
3
select manager.ename , employee.ename
from emp manager join emp employee
on manager.EMPNO = employee.MGR
where manager.HIREDATE<employee.HIREDATE;
4
SELECT e.ename, d.DNAME 
from emp e join dept d
on e.deptno = d.DEPTNO;
5
SELECT e.ename, d.loc 
from emp e join dept d
on e.deptno = d.DEPTNO;
6
select e.ename 
from emp e join jobhist j
on e.HIREDATE between j.startdate and j.enddate;

