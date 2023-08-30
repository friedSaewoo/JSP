const fileInput = document.querySelector('#file');
const fileList = document.querySelector('.file-list');
const submitBtn = document.querySelector('.submit-btn');

// 파일 선택 시 파일 목록 추가
fileInput.addEventListener('change', (e) => {
  const files = e.target.files;

  for (let i = 0; i < files.length; i++) {
    const li = document.createElement('li');
    li.textContent = files[i].name;
    fileList.appendChild(li);
  }
});

// 폼 제출 시 파일 유효성 검사
submitBtn.addEventListener('click', (e) => {
  e.preventDefault();

  const files = fileInput.files;

  for (let i = 0; i < files.length; i++) {
    if (!validateFile(files[i].name)) {
      alert('올바른 파일 형식이 아닙니다.');
      return;
    }
  }

  // TODO: 서버로 폼 데이터 전송
});

// 파일 유효성 검사 함수
function validateFile(fileName) {
  const allowedExtensions = /(\.jpg|\.jpeg|\.png|\.gif)$/i;
  return allowedExtensions.exec(fileName);
}
