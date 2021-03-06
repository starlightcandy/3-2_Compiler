# 1주차 Assignment - ADCompiler

###다음과 같은 명령으로만 AD언어(가칭)를 C코드로 바꾸어 파일에 출력하는 Java 프로그램을 작성

```
(def <id1> [<integer1>, <integer2>, ..., <integer10>])
(reduce <id2> <op> <integer1> <id3>)
(print <id3>)
```

###실행 방법
```
$ java -jar ADCompiler.jar /path/to/filename.ad

filename.ad파일이 있는 디렉토리에 filename.c파일이 생성됨
```
ex) test.ad를 대상으로 실행
```
$ java -jar ADCompiler.jar ./test.ad
```
###test 환경
사용된 OS : Mac OS X 10.11.6 <br />
사용된 C컴파일러 : Clang-703.0.31 <br /> <br />

Assignment 설명 
--------
###AD언어 설명
**`def`** 는 `<id1>`에 해당 숫자리스트를 지정한다.<br />
여기서 `<id>`는 길이 5 이하인 문자열이고 `<integer>` 값은 5개 이하이다.<br /><br />
**`reduce`**는 `<id2>`에 있는 숫자리스트를 가지고 `<op>` 계산을 한 결과를 `<id3>`에 저장한다. `<op>`는 `+` 또는 `*` 이다.<br />
초기값은 `<integer1>` 이다.<br /><br />
**`print`**는 주어진 식별자가 가지는 값을 출력한다. (리스트면 “,”로 분리한다.)<br /><br />
ex1)<br />
```
(def list1 [1, 2, 3, 2, 3])
(reduce list1 + 0 res)
(print res)

출력 : 11
```
ex2)<br />
```
(def list1 [1, 2, 3, 2, 3])
(reduce list1 * 1 res)
(print res)

출력 : 36
```

###주의사항:
- 제시된 것 이 외의 프로그램 입력의 오류는 없다고 가정한다. (즉 모든 입력이 올바르게 주어진다고 가정한다.)
- 오류 처리나 오류 메시지를 멋지게 만들 필요는 없다.
- 입력 AD 프로그램은 대소문자 구분이 있다.
- 입력 AD 프로그램에서 빈 줄은 없다고 가정한다.
- 결과로 만든 C 코드의 최적화는 고려하지 않는다.
- 반드시 입력 AD 프로그램에 맞는 JAVA 코드를 작성하여야 한다.(즉 다른 입력을 주어도 그에 알맞은 C 코드를 생성하여야 한다.)
- 기한은 2016년 9월 12일 23시59분59초 이다.
- 제출은 이러닝사이트를 이용한다.
- 제출 방식: 잘 도큐먼트된 소스파일을 업로드 (사용된 O/S와 컴파일러 명시 요함)
