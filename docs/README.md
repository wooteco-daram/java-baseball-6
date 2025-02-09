## ✅ 구현할 기능 목록 (1차)
- [x] 게임 시작 문구 출력하기
- [x] 컴퓨터가 랜덤으로 숫자 생성하기
- [x] 사용자에게 숫자 입력받기
  - [x] 잘못된 값을 입력하면 `IllegalArgumentException` 예외 발생하기
- [x] 볼, 스트라이크 수 얻기
  - [x] 볼 수 얻기
  - [x] 스트라이크 수 얻기 
  - [x] 볼, 스트라이크 결과 출력하기
    - [x] 아무 볼, 스트라이크도 없을 시 `"낫싱"` 출력하기 
- [x] 게임 종료 문구 출력하기
- [x] 게임 재 시작 / 종료 입력받기

## 🛠️ 리팩터링 목록 (2차)
- [x] `GameState` 를 관리하는 `GameStateManager` 객체 작성
- [x] 랜덤으로 숫자를 가져오는 로직 `Util` 패키지로 분리
- [x] 화면 도메인 작성
  - [x] 화면의 입력을 담당하는 `Input` 도메인 작성
  - [x] 화면의 출력을 담당하는 `Output` 도메인 작성
    - [x] 게임 결과를 알려주는 출력 규칙들을 정의
  - [x] 화면을 담당하는 `Scene` 객체 작성
  - [x] 화면을 관리하는 `SceneManager` 객체 작성
  - [x] 화면을 생성해주는 `SceneFactory` 객체 작성
- [x] 게임 도메인 작성
  - [x] 게임 전반적인 흐름을 제어하는 `GameManager` 작성
  - [x] 게임 결과 값을 담는 `BallAndStrike` 작성
  - [x] 게임 결과를 계산하는 `BaseBallResult` 객체 작성
- [x] 게임 규칙 도메인 작성
  - [x] 스트라이크 규칙을 정의한 `StrikeRule` 객체 작성 
  - [x] 볼 규칙을 정의한 `BallRule` 객체 작성