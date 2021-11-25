select *from dept;
select *from emp;
1
select e.ename , d.loc
from emp e , dept d
where e.DEPTNO = d.DEPTNO and d.LOC = 'CHICAGO';
2
select e.ename , d.loc
from emp e , dept d
where e.DEPTNO = d.DEPTNO
ORDER BY D.LOC;
3
select e.ename , c.ename
from emp e , emp c
where e.empno = c.mgr and e.HIREDATE > c.HIREDATE;
4
select e.ename , d.DNAME
from emp e , dept d
where e.DEPTNO = d.DEPTNO;
5
select e.ename , d.loc
from emp e , dept d
where e.DEPTNO = d.DEPTNO;
6
select e.ename , j.empno
from emp e , jobhist j
where e.HIREDATE between j.startdate and j.enddate;
1
SELECT e.ename d.loc 
from emp e join dept d
on emp.deptid = dept.deptid;
select *from emp;