import Vue from 'vue'
import App from './App'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import echarts from 'echarts'
import 'echarts/map/js/world'

Vue.use(ElementUI, { size: 'small', zIndex: 3000 });
Vue.prototype.$echarts = echarts
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  render: h => h(App)
})
