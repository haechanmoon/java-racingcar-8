# java-racingcar-precourse

## 기능 목록 리스트

- [x] 자동차 이름 입력 요구 출력
- [x] 자동차 이름 입력 받기
- [x] 시도할 횟수 입력 요구 출력
- [x] 시도할 횟수 입력 받기
- [x] 자동차 전진 기능 구현
- [x] 실행 결과 화면 출력
- [x] 최종 우승자 구하기
- [x] 최종 우승자 이름 출력

## 예외사항 리스트

- [x] 자동차 이름 입력란이 공백인지 검사
- [x] 자동차 이름 자체가 공백인지 검사
- [x] 자동차 이름 길이 검증 (5자 초과 시 예외 발생)
- [x] 시도할 횟수가 숫자인지 검사
- [x] 시도할 횟수가 자연수인지 검사

## 테스트 리스트

- [x] 이름 입력값이 공백일 때 `IllegalArgumentException` 반환
- [x] 자동차 이름 자체가 공백일 때 `IllegalArgumentException` 반환
- [x] 6자 입력 시 IllegalArgumentException 발생 확인
- [x] 자연수일 때 성공
- [x] 시도할 횟수가 음수일 때 `IllegalArgumentException` 반환
- [x] 시도할 횟수가 자연수가 아닐 때 `IllegalArgumentException` 반환
- [x] 자동차 전진 확인
- [x] 위치만큼 `-` 출력 확인
- [x] 최종 우승자 출력 확인