<template>
  <div >
    <p>{{msg}}</p>
    <b-button variant="primary">Click me</b-button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data(){
    return {
      msg: " "
    }
  },
  created() {
    fetch("/api/message")
    .then(res => res.text())
    .then(text => this.msg = text)
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
