# Project 1 : FindPublicWifi
- 서울 공공 데이터 API를 이용해 자신의 위치 및 특정 위치에서 1km 내에 존재하는 공공 와이파이를 찾는 프로젝트 
- Project to find public Wi-Fi around you using public data API

<br>

- 프로젝트 작동 순서 및 기능 
  - 서울시 공공 와이파이 서비스 위치 정보(http://data.seoul.go.kr/dataList/OA-20883/S/1/datasetView.do) 를 받아와 데이터베이스 public_wifi 테이블에 저장 

  - '내 위치 가져오기' 버튼 클릭시 'geolocation'을 이용하여 사용자의 현재 위치를 가져옴.
  - 또는 직접 좌표 입력이 가능해 특정 위치 주변의 공공 와이파이를 찾을 수 있음.
  - '근처 wifi 정보 보기' 버튼 클릭시 public_wifi에 저장되어있는 좌표와 현재 입력된 좌표를 계산해 결과값이 1이하인(1km 이내) 공공 와이파이 정보를 출력해 화면에 테이블로 보여줌
  - 또한 '근처 wifi 정보 보기' 버튼 클릭시 추가적으로 좌표와 검색시간이 search_history 테이블이 저장됨. 이때 id는 자동으로 증가하며 생성되며 또한 delete 역시 false로 초기화되어 생성됨
  - '위치 히스토리 목록' 탭을 선택하면 search_history 테이블에 저장된 데이터를 불러와 화면에 출력함. 이때 id는 실제 데이터베이스 id와 맞지 않기 때문에(실제로 데이터를 삭제하는 것이 아니라 불러오지 않는 것) id를 따로 설정해주며, 실제 id는 삭제 기능에 쓰임
  - 각 테이블에 있는 '삭제' 버튼을 클릭하면 search_history 테이블의 delete 키를 true로 바꿔줌. 이때 실제 id가 파라미터로 쓰이기에 데이터를 불러올때 같이 불러와야 한다.
<br>
  
