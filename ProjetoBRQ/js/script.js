const card = document.querySelectorAll('.containerTimes .times');
const button = document.getElementById('idtime');

card.forEach((imagem) => {

    imagem.onclick = function() {
        if (imagem.style.display === ' inline-block ') {
            imagem.style.display = 'none ';
        } else {
            imagem.style.display = 'block ';
        }
    }

    imagem.onmouseover = function() {
        this.style.transform = 'scale(2)';
    }

    imagem.onmouseout = function() {
        this.style.transform = 'scale(1)';
    }

    imagem.onclick = function() {
        window.location.href = "/timesHTML/atletico";
    }


});
//////////////////////////////////q
// var buttonTimeB = document.getElementById("idtimeB");
// buttonTimeB.addEventListener("onclick", function() {
//             const times = document.getElementById("containerTimes");
//             times.ClassList.toggle("hide");
//         }

///////////////////////////////////////
// button.addEventListener("onclick", function() {
//     const card = document.querySelectorAll('.containerTimes .times');

//     if (times.style.display === "none") {
//         times.style.display === "block";

//     } else {
//         times.style.display === "none"
//     }

// })

// console.log(card);
////////////////////////////////////
// function exibeDiv() {
//     var div = document.getElementById("containerTimes");
//     if (div.style.display === ' block ') {
//         div.style.display = 'none ';
//     } else {
//         div.style.display = 'block ';
//     }
// }
/////////////////////////////////////