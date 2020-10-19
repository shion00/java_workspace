 
 변수와 자료형 

1 다음 설명 중 틀린 것은?
(1) CPU는 메모리의 올라온 데이터를 대상으로 연산을 수행하므로, 컴퓨터에게 업무를 시키려면 
    프로그래머는 데이터를 메모리에 올리는 방법을 알아야 한다.
	o : 변수선언
(2) 컴퓨터에게 연산업무를 시키려면 메모리에 올려질 데이터의 종류까지도 반드시 명시해야 하는데, 
    일반적으로 프로그램에서 사용할 수 있는 기본적 데이터의 종류는 크게 문자,숫자,논리값 3가지가 있다.
	o : 사람의 위한 것이다.
(3) C 혹은 Java 에서 컴퓨터의 메모리에 3이라는 데이터를 올리기 위해서는  x=3; 이라고 하면 된다.
	x : 자료형
(4) 컴퓨터에게 일을 시키기 위해 데이터를 메모리에 올릴 경우, 이 데이터를 담기 위해 얼마 만큼의 용량을
   확보할지는 프로그래머가 결정하지 못한다.
	x : 자료형이 바로 용량을 결정한다.! 이것이 바로 자료형의 의미이다.
(5) 데이터가 메모리에 올라가는 시점은 프로그램 소스 파일을 저장할 때이다.
	x : 이 세상의 모든 프로그램에서 메모리에 데이터가 올라오는 경우는 오직 실행할때만 이다! 컴파일일때도 아님
(6) 프로그램의 실행이 종료되면 메모리에 올려진 숫자,문자,논리 데이터는 메모리에서 사라진다. 
	o : 다 사라짐
	
2 다음 설명 중 틀린 것은?
(1) 돈의 단위로는 원화,달러 등이 있듯, 컴퓨터 시스템이나 프로그램 언어에서 다루는 데이터에도 단위가 존재 
    하는데, 이러한 단위에는 bit, byte 가있다.
	o :
(2) 컴퓨터에 사용 가능한 데이터의 최소단위는 byte 이다.
	x : bit
(3) 컴퓨터에서 다루는 데이터의 기본 단위는 byte 이다	
	o :
(4) 만일 bit 를 컴퓨터의 기본 단위로 했다면, 1 bit가 0과1 이라는 단 2가지 경우의 수만 표현할 수 있는 
    작은 용량이므로 업무 처리시 상당한 불편함을 초래했을 것이다.
	o : 
(5) 위(4)번과 같은 이유로 데이터 처리에 효율성을 위해 1bit 를 8개 모아놓은 단위를 기본 단위로 삼게 되었
   으며 이 기본단위를 byte 라 한다.
	o :

3 자바의 기본 자료형에 대한 설명으로 틀린 것은?
(1) 자바도 다른 언어와 마찬가지로 기본 자료형은 총 3가지이며 여기엔 숫자 ,문자, 논리값이 있다.
	o :
(2) 메모리에 데이터를 올리려 할때 , 대부분의 프로그래밍 언어가 반드시 지키는 규칙은 아래와 같다.
    변수명 = 데이터 ; 
	x : 자료형 변수명=데이터;
(3) 자바의 기본 자료형 중 숫자형은 소수점을 표현할 수 있는지 여부에 따라 정수형과 실수형으로 분류할
    수 있다.
	o : 
(4) 자료형 선언이 갖는 의미는 메모리에 올려질 데이터가 차지하게 될 용량의 결정에 있다.
	o : 
(5) 정수형은 크기에 따라  byte < short < int < long 형으로 분류될 수 있고 메모리에서 차지하는 용량의 크기
    는 각각 1,2,4,8 byte 씩이다.
	o :
(6) 실수형은 크기에 따라 float < double 형으로 분류될 수 있고 메모리에서 차지하는 용량의 크기는 각각 
    4byte, 8byte 씩이다.
	o :

4 아래의 코드에 대한 설명 중 맞는 것은? 
int x = 3; (A)
x=5; (B)
int x=7; (C)
(1) (A )에서 메모리 공간을 확보하고, 그 공간에 3이라는 상수를 담되, x라는 이름으로 가리키고 있다.
o
(2) (B)에서 x를 중복정의 했으므로 에러가 발생할 것이다.
x
(3) (C)에서 x변수가 가리키는 값이 7로 변경된다.
x : 중복선언으로 에러가 난다.!!
(4) (A)에서 3이라는 데이터를 담기 위해 메모리에 확보되는 용량은 4byte 이다
o

5 다음 설명 중 틀린 것은?
(1) short a = 3; 이라는 소스를 작성할 경우, 3이라는 데이터를 담기 위해 메모리에 확보되는 데이터 용량은
    2byte 이다. 
o
(2) byte 자료형으로 표현할 수 있는 경우의 수는  2의 8승인 256 가지인데,  sun에서는 이 byte형으로 표현
   할 수 있는 숫자를 -255 부터 0까지로 정했다.
x : -128 ~ 127 까지로 정함
(3) 자료형에 따라 메모리에 차지하는 데이터의 용량이 다르다.
o :
(4) 선언한 자료형에 의해 알맞는 용량이 메모리에 확보되는 시점은 컴파일 시점이다
x : 실행 할때 메모리의 데이터 용량이 확보된다.

6 문자 자료형인 char에 대한 설명 중 틀린 것을 모두 고르면?
(1) 자바언어는 한글 등 다국어를 지원하므로 아래와 같이 char형 변수 a에 한글인 ‘가’ 등을 담을 수 있다.
   char a = ‘가’
o : char 2byte인 이유인 유니코드 기반이다.
(2) char형이 메모리에서 차지하는 용량은 1byte 이다.
x : 2byte
(3) 아래의 코드는 에러가 날 것이다.
    char k=true;
o : 문자를 담아야 정상이다
(4) 아래의 코드는 에러가 날 것이다.
   char c=65;
x : //char 는 문자와 숫자형을 넣을 수 있다. 이때의 숫자는 키코드 값이다!!
(5) 아래의 코드는 에러가 나지 않을 것이다.
   char y = -10;
x : 0부터 2의 16승 -1 까지 가지수, 문자코드를 참조하기 때문에 문자코드에는 음수가 없다.

7 컴퓨터는 1과 0만을 이해하므로 , 프로그래밍 언어에서 사용되는 문자,숫자,논리값은 사실상 0과 1으로 변환되
어질 대상이 된다. 하지만 숫자나 논리값은 0과 1로 변환이 가능하나 문자는 직접적으로 0과 1로 변환하는 것은
불가능 하므로 ,키보드 자판에 존재하는 모든 영문자와 특수문자에 대해 1:1로 대응하는 정수를 미국의 표준협회인 
ANSI가 제시했는데, 이 코드 체계를 무엇이라 하는가? 
 (           아스키코드                      )

8 다음 설명 중 틀린 것은?
(1) ASCII코드는 영미권 문자인 알파벳을 위주로 한 코드 체계이므로, 컴퓨터의 메모리에 올려질 데이터의 개수
가 얼마 되지 않아 1byte만으로도 충분하다.
o : 

(2) 한글, 중국어 ,아랍어 등 비영어권 문자를 1byte 용량으로 표현하기엔 부족하므로 ASCII코드보다 넓은 범위
    의 문자 코드 체계로 확장시킨 코드표를 유니코드라 한다.
o : 자바는 유니코드가 기본이다.

(3) 유니코드는 컴퓨터의 메모리에 올려질 데이터의 개수가 ASCII보다 훨씬 많으므로 2byte 용량은 되어야 유니
코드에서 정한 모든 문자를 감당할 수 있다.
o :

(4) 자바언어는 char a=’대’ 와 같이 프로그램 작성시 한글 문자 사용이 가능하므로 유니코드를 지원하는 언어
로 볼 수 있으며 , 이 char 형에 의해 메모리에 확보되는 용량은 1byte로 볼 수 있다.
x  : 2byte 이다.

9 문자 자료형인 char에 대한 설명 중 맞는 것은?
(1) char a=’A’ 가 실행될 경우 메모리에 실제 ‘A’라는 문자 자체가 올라간다
x : 
(2) char형에는 정수만 담을 수 있으므로, 10진수는 담을 수 있으나16진수를 담을 수는 없다.
x : 
(3) char x=65; 를 입력하면 컴파일러는 아스키코드에서 65에 매칭되는 정수를 찾는다.
x : 찾을 필요없다, 찾아서 이미 넣었다. 
(4) 컴퓨터의 메모리에는 문자 자체가 올라갈 수 없으므로 사실상 자바언에서 사용되는 char형은 숫자 자료형
으로 봐도 무관하다.
o : 모든 포로그래밍 언어에서 문자는 사실상 숫자이다!!!

10 괄호안을  채우세요.
자바는 유니코드 기반이므로, char 형으로 선언된 데이터는 메모리에 (2)byte 를 차지하게 된다.
따라서 유니코드가 표현할 수 있는 문자의 개수는 (    2의 16승     ) 가지이므로 현존하는 전세계 언어를
표현할 수 있다.

11 기본 자료형의 메모리 용량을 계산해 보세요 

자료형
byte용량
표현 데이터 범위
boolean

1 
-2의 n-1승 ~ 0~ 2의 n-1승 -1


char


2

byte

1


short


2

int
4



long
8



float

4


double


8

   
12 다음 설명 중 맞는 것은?
class MyClass{
     public static void main(String[] args){
          int  a=7;        (가)
          int  a=3;        (나) 
		{
			int a=3;     (다)
		}
		{
			a=5;        (라)
		}
		System.out.println(a); (마)
	}
}
(1) (나) 는 중복된 변수 선언으로서 컴파일 에러가 발생한다.
o : 
(2) (다)의 경우 (가) 와 중복된 선언이기는 하지만 지역변수 영역안에 선언하였으므로,
(가)와 충돌되지 않기 때문에 컴파일 에러는 발생하지 않는다.
x :
(3) (라)에서 컴파일에러가 발생할 것이다.
(4) (마)의 출력결과는 7이다.
x :

13 변수에 대한 설명 중 틀린 것은?
(1) 변수의 첫 문자는 숫자로 시작할 수 없다.
o : 
(2) 변수의 첫 문자는 원칙상 특수문자로 시작할 수 없으나 예외적으로 _(언더바) 또는 $ 는 사용이 가능하다.
o :
(3) 예약어는 변수명으로 사용할 수 없다.
o : ex) int class=7;  
(4) 변수명을 대문자로 사용할 경우 에러가 발생한다.
x : 쓰지 않는 이유는 클래스랑 혼동되기 때문이다! 다른 개발자와 협업위함
(5) 자바 언어에서 클래스명은 대문자로 함이 관례이다.
o :



