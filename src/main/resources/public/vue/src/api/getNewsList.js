import axios from 'axios';

function request(config) {
  const instance = axios.create({
    baseURL: "http://localhost:8080",
    timeout: "2000"
  })
  return instance(config)
}

export function getJosn() {
  return request({
    url: "/src/api/accordion.json"
  })
}