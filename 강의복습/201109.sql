-- scott가 사용할 수 있는 테이블 다 보여줘
select * from tab;
select * from emp;
select * from dept;
-- 자기 부서 평균보다 급여를 많이 받는 사람의 이름, 급여
-- 상관관계 질의(query)
select ename, sal from emp e where
sal > (select round(avg(sal)) from emp
    where e.deptno=deptno);
-- 자기 부서 평균보다 급여를 많이 받는 사람의 이름, 급여, 부서 평균급여
-- in_line view : from뒤의 sub query를 사용해서 table처럼 처리하는 것
select e.ename,e.sal,a.avg, e.deptno from emp e, (select deptno,round(avg(sal)) avg
 from emp group by deptno) a where e.deptno=a.deptno and sal > avg;
-- 급여를 많이 받는 직원 5명 순서대로 topN
-- mysql : select ename,sal from emp order by sal desc limit 5;
select rownum, ename,sal from emp;
-- rownum : 테이블로 부터 데이터를 추출하는 순서
select a.*, rownum from (select rownum rn, ename, sal from emp order by sal desc)a
where rownum <= 5;
-- 6등 ~ 10등까지 출력
-- mysql : select ename, sal from emp order by sal desc limit 5, 5;
select a.*, rownum rn from (select  ename, sal from emp order by sal desc)a;
select * from (select a.*, rownum rn from (select  ename, sal from emp order by sal desc)a)
where rn between 6 and 10;
select * from emp;