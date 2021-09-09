const durationFields = document.querySelector(".duration")
const distanceField = document.getElementById("distance")

distanceField.onkeyup = () => {
    if (!isNumber(distanceField.value)) {
        distanceField.value = ""
        distanceField.classList.add("invalidInput")
    } else {
        distanceField.classList.remove("invalidInput")
    }
}

for (let field of durationFields.querySelectorAll("input")) {
    field.onkeyup = () => {
        checkFields(field)
    }
    field.onclick = () => {
        checkFields(field)
    }


}

function checkFields(field) {
    if (field.value < 0) {
        field.classList.add("invalidInput")
        field.value = 0
    } else if ((field.id === "minutes" || field.id === "seconds") && (field.value >= 60)) {
        field.classList.add("invalidInput")
        field.value = 59
    } else {
        field.classList.remove("invalidInput")
    }
}

function isNumber(x) {
    return /^ *[+]?[0-9]+(\.[0-9]*)? *$/.test(x);
}

