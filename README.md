# Java Grammar Comprehensive Class 3

## 소개

**Java Grammar Comprehensive Class 3** 프로젝트는 자바 문법 종합반 3주 차 과제로서, 기본적인 사칙연산을 수행하는 계산기 애플리케이션을 구현합니다. 이 프로젝트는 객체지향 프로그래밍의 원칙을 적용하여 각 연산을 별도의 클래스로 분리하고, `Calculator` 클래스와의 관계를 설정합니다.

## 기능

- **사칙연산 수행**: 더하기, 빼기, 곱하기, 나누기 연산을 수행합니다.
- **유연한 연산 확장**: 각 연산을 별도의 클래스로 구현하여 확장성과 유지보수성을 높였습니다.

## 설치 및 실행 방법

1. **저장소 클론**: 터미널 또는 명령 프롬프트에서 다음 명령어를 실행하여 저장소를 클론합니다.

   ```bash
   git clone https://github.com/ijieun0123/Java-Grammar-Comprehensive-Class-3.git
   ```

2. **프로젝트 디렉토리로 이동**:

   ```bash
   cd Java-Grammar-Comprehensive-Class-3
   ```

3. **필요한 의존성 설치**: Gradle을 사용하여 의존성을 설치합니다.

   ```bash
   ./gradlew build
   ```

4. **애플리케이션 실행**:

   ```bash
   ./gradlew run
   ```

   또는 생성된 JAR 파일을 직접 실행할 수 있습니다.

   ```bash
   java -jar build/libs/Java-Grammar-Comprehensive-Class-3.jar
   ```

## 사용 방법

1. 프로그램을 실행하면 콘솔에 다음과 같은 메시지가 표시됩니다.

   ```
   첫 번째 숫자를 입력하세요:
   ```

2. 첫 번째 숫자를 입력한 후, 다음 메시지가 표시됩니다.

   ```
   연산자를 입력하세요 (+, -, *, /):
   ```

3. 연산자를 입력한 후, 다음 메시지가 표시됩니다.

   ```
   두 번째 숫자를 입력하세요:
   ```

4. 두 번째 숫자를 입력하면 결과가 출력됩니다.

   ```
   결과: [계산 결과]
   ```

## 클래스 구조

- **Calculator**: 연산을 수행하는 메인 클래스입니다. 각 연산 클래스와의 관계를 맺고, 입력된 연산자에 따라 해당 연산 클래스를 호출하여 연산을 수행합니다.
- **AddOperation**: 더하기 연산을 수행하는 클래스입니다.
- **SubtractOperation**: 빼기 연산을 수행하는 클래스입니다.
- **MultiplyOperation**: 곱하기 연산을 수행하는 클래스입니다.
- **DivideOperation**: 나누기 연산을 수행하는 클래스입니다.

