const innerBox = document.querySelectorAll(".progress-inner-border")
let i = 0;
updateProgress()

function updateProgress () {
    for (let progressRow of innerBox) {
        let progressValue = progressRow.querySelector("input").value
        let badgeProgress = progressRow.closest(".challenge-wrapper").querySelector(".badge-progress")
        let badge = progressRow.closest(".challenge-wrapper").querySelector(".badge")
        console.log(progressValue)
        if (progressValue < 1.0) {
            progressRow.style.width = (progressValue * 100) + "%"
            move(progressRow, progressValue*100)
            badgeProgress.style.width = (100 - (progressValue * 100)) + "%"
        } else {
            move(progressRow, progressValue*100)
            progressRow.style.width = "100%"
            badgeProgress.style.width = "0%"
            progressRow.classList.add("completed")
            badge.classList.add("badge-achieved")
        }
    }
}

function move(innerBar, maxWidth) {
  if (i == 0) {
    i = 1;
    let elem = innerBar;
    let width = 1;
    let id = setInterval(frame, 10);
    function frame() {
      if (width >= maxWidth) {
        clearInterval(id);
        i = 0;
      } else {
        width++;
        elem.style.width = width + "%";
      }
    }
  }
  i = 0;
}