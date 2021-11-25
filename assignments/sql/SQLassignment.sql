1
EXEC sp_columns DEPT;
select *from DEPT;
2
EXEC sp_columns EMP;
select JOB,HIREDATE,EMPNO from EMP;
3
SELECT ENAME , JOB ,  SAL 'MONTHLY SAL',SAL*12 'ANNUAL SAL'
FROM EMP;
4
SELECT ENAME+','+' '+JOB 'Employee and Title' 
FROM EMP;
5
SELECT DISTINCT job from EMP;
6
SELECT ENAME ,SAL 
FROM EMP
WHERE SAL>2850;
7
SELECT ENAME ,DEPTNO 
FROM EMP
WHERE ENAME='SMITH';
8
SELECT ENAME , JOB 
FROM EMP 
WHERE HIREDATE BETWEEN 'February 20, 1981' AND 'May 1, 1981';
select *from emp;
9
select ename , deptno 
from emp
where DEPTNO in (10,30)
order by ename;
10
select ename ,HIREDATE
from emp
where year(HIREDATE) like '1982%'; 
11
select ename , job 
from emp 
where mgr is null;
12
select cast(getdate() as date);
13
select manager.ename , employee.ename
from emp manager , emp employee
where manager.empno = employee.mgr and manager.HIREDATE < employee.HIREDATE;
15
select ename , DEPTNO
from emp 
where DEPTNO in (20,30,40);
16
select ename
from emp
where ename like 't%r';
17
select ename , HIREDATE
from emp
where DEPTNO = 30;
18
SELECT ename, 
TO_CHAR( hiredate , 'fmMonth DD, YYYY' ) Hiredate
FROM emp
19
select ename ,HIREDATE
from emp
where year(HIREDATE) like '_____12%'; 
20
select job ,avg(sal*12) avragesal
from emp
group by job;
21


select * from emp;