<template>
  <b-container id="app">
    <b-row>
      <b-col><MenuNav></MenuNav></b-col>
    </b-row>
    <b-row>
      <b-col>
        <HelloWorld/>
      </b-col>
    </b-row>
  </b-container>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import MenuNav from "@/components/MenuNav";

export default {
  name: 'App',
  components: {
    HelloWorld, MenuNav
  }
}
</script>

<style>

</style>
