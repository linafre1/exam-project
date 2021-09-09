
const activities = document.querySelectorAll("article")


for (let activity of activities) {
    let button = activity.querySelector(".show-comments")
    let comments = activity.querySelector(".comment-wrapper")

    button.onclick = () => {
        comments.classList.toggle("hide")
    }
}
