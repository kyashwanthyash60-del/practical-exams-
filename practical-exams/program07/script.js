const form=document.getElementById('studentForm');
const list=document.getElementById('students');
const message=document.getElementById('message');
let students=JSON.parse(localStorage.getItem('students')||'[]');
function render(){list.innerHTML='';students.forEach(s=>{const li=document.createElement('li');li.textContent=`${s.name} — ${s.regno} — ${s.branch}`;list.appendChild(li);});}
form.addEventListener('submit',e=>{e.preventDefault();const student={name:document.getElementById('name').value.trim(),email:document.getElementById('email').value.trim(),regno:document.getElementById('regno').value.trim(),branch:document.getElementById('branch').value};students.push(student);localStorage.setItem('students',JSON.stringify(students));render();form.reset();message.textContent='Registration saved in this browser.';});
render();
