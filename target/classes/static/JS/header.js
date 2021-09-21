const openHamburgerMenu = document.querySelector(".header .hamburger #hamburger")
const closeHamburgerMenu = document.querySelector(".overlay .hamburger-wrapper .close")

openHamburgerMenu.onclick = () => {
    console.log("klick");
    document.querySelector(".overlay").classList.remove("hide");
}

closeHamburgerMenu.onclick = () => {
    document.querySelector(".overlay").classList.add("hide");
}


/*function openHamburger() {
    document.querySelector(".overlay").classList.remove("hide")
}

function closeHamburger() {
    document.querySelector(".overlay").classList.add("hide")
}

function setUpEventListeners() {
    openHamburgerMenu.onclick = openHamburger();
    closeHamburgerMenu.onclick = closeHamburger();
}*/
