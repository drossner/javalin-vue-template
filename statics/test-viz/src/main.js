import Vue from 'vue'
import App from './App.vue'
import fetchAbsolute from 'fetch-absolute'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue'

// Import Bootstrap an BootstrapVue CSS files (order is important)
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

// Make BootstrapVue available throughout your project
Vue.use(BootstrapVue)
// Optionally install the BootstrapVue icon components plugin
Vue.use(IconsPlugin)

Vue.config.productionTip = false

console.log("Loaded API Base is: "+process.env.VUE_APP_API_BASE)

let fetchOld = window.fetch
window.fetch = fetchAbsolute(fetchOld)(process.env.VUE_APP_API_BASE)

new Vue({
  render: h => h(App),
}).$mount('#app')

