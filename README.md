## 탭 레이아웃 구성 2017.02.15 프로젝트 시작.
- New/List 로 구성

### New (Layout : Linear버튼2개+(Linear텍스트2개))
- 메모입력창을 띄운다.
- 텍스트입력창 (상단) : 메모의 내용을 입력받는다.

- 버튼 (SAVE) : 바로 저장해 버린다. 저장 후 바로 List로 화면 전환.

### List 버튼 (Layout : Linear (cardView + Linear)
- 저장되어 있는 메모들을 보여준다. (카드뷰를 통해 목록 보여주기)
- 사용자가 파일을 선택하면 내용을 보여준다.
- 휴지통 버튼을 누르면 삭제 (다이얼로그로 메세지 출력.)

### 메모 내부
- 버튼 (SAVE) : 사용자가 편집 후 저장.
- 버튼 (DELETE) : 초기 메뉴로 나가버린다.

##추가 구성 계획

1. 메시지만 보여주는 토스트 만들어 에러사항이나 경과를 사용자에게
알려준다.
- SAVE버튼을 눌렀을때 경우의 수
  (경우1) 파일이름 정해주는 공간이 비어있다
  (경우2) 지정한 파일 이름이 이미 존재 한다.
  (경우3) 아무 문제없이 저장 완료

2. <del>카드뷰 클릭시 읽기 레이아웃 추가.</del>    2/16 추가완료.
3. <del>액티비티로 만들것인지 프래그먼트로 만들것인지 고려.</del>   2/16 activity로 설정.
4. <del>카드뷰에 삭제버튼 추가.</del> 2/16 추가완료.
4.1 삭제버튼 동작 구현.
5. <del>읽기 레이아웃에 수정 삭제 버튼 생성.</del> 2/16 추가완료.
5.1 수정,삭제버튼 동작 구현.
6. <del>카메라, 사진 버튼 추가</del> 2/16 다이얼로그 선택창으로 구현.
6.1 카메라,사진 동작 구현.
7. <del>날짜추가</del> 2/15 추가완료.
8. 날짜, 시간순서대로 위로 정렬.
9. 스크린샷를 했을 경우 바로 연동 가능하게 가능할까?
10. 사진이 추가됐을경우 레이아웃 구성 생각해봐야한다. 작은사진으로 만들고 클릭했을때 크게 보여질수있을까
11. 카드뷰를 클릭하고 들어갔을경우 바로 수정할수있는것이 아니라, 텍스트 메세지로 보여주고, 수정을 눌렀을경우 수정할수 있도록 변경 가능?
