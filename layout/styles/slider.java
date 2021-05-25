const carouselSlide = document.queryselector('.carousel-slide');
const carouselImages = document.queryselectorall('.carousel-slide img');

//buttons
const prevbtn = document.queryselector('#prevbtn');
const nextbtn = document.queryselector('#nextbtn');

//counter
let counter = 1;
const size = carouselImages[0].clientwidth;

carouselSlide.style.transform = 'translateX(' + (-size * counter) + 'px)';