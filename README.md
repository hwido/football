# football
this is project with my friends
2023 여름 방학때부터 시작한 황지환, 이상진, 정휘도의 협업으로 진행

2023/07/08
1차적인 로그인 화면 완성. 이후 회원가입 화면, 파이어베이스 연결 구현 예정

2023/07/10
로그인 화면에 대한 수정, 회원가입 화면 완성. 이후 파이어베이스 연결 및 버튼 통한 페이지 이동 구현 예정

2023/07/11
파이어베이스 연결 위한 코드 작성 완료, 각 페이지에서 버튼 누르면 화면 전환 위한 코드 작성 완료.
이후 회원가입 시 작성되는 데이터에 대한 저장 필요. sql 사용이나 파이어베이스에서 데이터 저장에 연동하는 것을 고려해볼 필요 있다.

2023/07/12
회의 결과, 아이디 중복 체크, 회원가입정보저장(파이어베이스), 로그인 정보 암호화 3가지를 추가적으로 구현하기로 결정

2023/07/16
파이어베이스 연동 완료. 파이어베이스 자체에는 이메일+패스워드 기능은 있으나, 아이이+패스워드 기능은 없는 상태이다. 추후 학과 프로젝트 진행 시에는 다른 방식을 채택해야 할 필요가 있다.

2023/07/19
각자 만든 것들에 대한 변수명 및 파일 명 획일화 위한 회의 진행. 또한, 3명이 동시에 관리할 수 있는 리포지토리 생성. 이후 readme에 추가해둘 예정이다.

2023/07/23
3명이서 만든 것들을 연결시키는 작업 진행중. 몇몇 오류와 이름변경, 기능 추가가 이루어질 예정이다.
databinding 중에 unresolved reference error 발생. 이는, xml 파일을 layout으로 묶어주자 해결되었다.
이후, xml파일의 id 가져오는 과정에서 통일된 id 인식하지 못하는 에러 발생 -> 기존 id로 교체시 제대로 인식하였다.

2023/07/24
연결작업 완료. 다른 2명이 각자 만든 개인 정보 등록 화면을 1개로 합쳤다.
하지만, 페이지 간에 넘어가는 작동에 있어서 오류 발생. 개인 정보 작성 화면으로 넘어가지는 과정에서 에러가 발생한다.

2023/07/25
지환이가 frame이라 적힌 곳을 AppcompatActivity()로 바꾸면 된다고 하였으나, 달라진 바 없음.
xml 파일도 수정했으나, 여전히 오류코드 존재

2023/07/29
26일날 회의 통해 오류 코드 생긴 곳을 수정 완료. 모든 페이지가 정상적으로 작동하고 있다.
데이터베이스에 데이터 넣는 작업을 완료해야 하는데, 이는 상진이가 준 페이지의 주석처리된 코드 수정으로 해결 예정이다.
또한, 지환이가 수정중인 부분은, 개인 프로필 화면(사진) 바꾸는 코드이다.
로그인 이후 화면은 각자 구상중이다. -> 메인, 팀, 개인

2023/07/30
데이터베이스 연결 완료. 상진이 코드 기반으로 하니, firestore database가 아닌 realtime database로 연결이 되고 있었다.
이후 로그인 후에 나오는 페이지들 구현 예정 -> 정휘도 : 메인, 이상진 : 팀, 황지환 : 개인

2023/08/06
황지환이 올려둔 코드 통합하여 프로필 사진 교체하는 코드 완성. 개인 정보 작성 이후 로그인 화면으로 돌아오도록 연결 완료.
이후 로그인 후에 나오는 페이지 제작과 연결 예정

2023/08/08
메인 페이지 제작 시작. 현재 전체적인 틀이 완성된 상태.
이후 버튼 누르면 세부 화면 바뀌는 기능 추가 예정. 또한, 3명의 파일을 합쳐서 버튼 누르면 탭 바뀌는 기능 추가 예정.

2023/08/12
팀 정보 저장하는 기능 추가 완료.
이후 프로필 및 구단 사진 등록하는 기능 추가 예정. 또한, 메인 페이지 세부 기능 구현 예정.

2023/08/21
메인 페이지에서 버튼 누르면 세부 내용 바뀌는 작업 진행 중. 처음 알아본 자료를 참고하여 만든 경우, 현재 코틀린이 지원하지 않는 방향이었기에, 다른 자료를 찾아서 하나하나 수정이 진행되고 있다.
메인 페이지에서 세부내용 바뀌는 코드 완성시, 나머지 2명과의 코드 결합을 통해서 각 페이지를 버튼 눌러서 이동할 수 있게 될 것이다.

2023/08/22
메인 페이지에서 버튼 누르면 세부 내용 바뀌는 작업 완료. fragment 이용해서 해당 부분이 바뀌도록 진행하였다.
이후, 나머지 2명의 코드 합치는 작업과, 세부 페이지에 들어갈 내용들 만드는 작업 진행 예정
