import axios from "axios";

export default axios.create({
    baseURL:'https://eca8-103-205-99-178.ngrok-free.app',
    headers:{"ngrok-skip-brower-warning":"true"}
})