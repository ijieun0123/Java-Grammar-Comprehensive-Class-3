# 자바 문법 종합반 3 week 과제

**********

## 계산기 만들기

### Step 1 
더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만듭니다.
Calulator 클래스는 연산을 수행하는 반환 타입이 double인 calculate 메서드를 가지고 있습니다.
calculate 메서드는 String 타입의 operator 매개변수를 통해 연산자 매개값을 받습니다.
int 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
calculate 메서드는 전달받은 피연산자, 연산자를 사용하여 연산을 수행합니다.
힌트) if or switch 즉, 제어문을 통해 연산자의 타입을 확인하고 해당하는 타입의 연산을 수행하고 결과값을 반환합니다.

### Step 2 
나머지 연산자(%)를 수행할 수 있게 Calculator 클래스 내부 코드를 변경합니다.
힌트) 제어문 else if 에 나머지 연산자(%)를 추가합니다.

### Step 3
<img width="613" alt="스크린샷 2025-01-04 오후 9 28 14" src="https://github.com/user-attachments/assets/ebfa20fe-e0a7-45d5-8360-cfcdaf9a3397" />

AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를 만든 후 클래스 간의 관계를 고려하여 Calculator 클래스와 관계를 맺습니다.
관계를 맺은 후 필요하다면 Calculator 클래스의 내부 코드를 변경합니다.. 나머지 연산자(%) 기능은 제외합니다.
### 힌트

AddOperation, SubstractOperation, MultiplyOperation, DivideOperation 연산 클래스들을 만듭니다.
각각의 연산 타입에 맞게 operate 메서드를 구현합니다.
Calculator 클래스와 포함관계를 맺고 생성자를 통해 각각의 연산 클래스 타입의 필드에 객체를 주입합니다.
calculate 메서드에서 직접 연산을 하지 않고 주입받은 연산 클래스들의 operate 메서드를 사용하여 연산을 진행합니다.

### Step 4
<img width="621" alt="스크린샷 2025-01-04 오후 9 28 50" src="https://github.com/user-attachments/assets/4270225b-d8fd-482d-b6ad-afdada85719d" />

AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스들을 AbstractOperation(추상 클래스)를 사용하여 추상화하고 Calculator 클래스의 내부 코드를 변경합니다.
주의) Calculator의 calculate 메서드의 매개변수가 변경되었습니다.
### 힌트

AbstractOperation 추상 클래스를 만들고 operate 추상 메서드를 만듭니다.
AddOperation, SubstractOperation, MultiplyOperation, DivideOperation 클래스들은 AbstractOperation 클래스를 상속받고 각각의 연산 타입에 맞게 operate를 오버라이딩 합니다.
Calculator 클래스는 4개의 연산 클래스들이 상속받고 있는 AbstractOperation 클래스만을 포함합니다.
생성자 혹은 Setter를 사용하여 연산을 수행할 연산 클래스의 객체를 AbstractOperation 클래스 타입의 필드에 주입합니다.(다형성)
calculate 메서드에서는 더 이상 연산자 타입을 받아 구분할 필요 없이 주입 받은 연산 클래스의 operate 메서드를 통해 바로 연산을 수행합니다.

