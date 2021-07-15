import Vue from 'vue'
import App from './App'
import echarts from 'echarts'
import 'echarts/map/js/world'
Vue.prototype.$echarts = echarts

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  render: h => h(App)
})
