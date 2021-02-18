<template>
  <div class="home">
    <MenuNav></MenuNav>
    <MainPage></MainPage>
  </div>
</template>

<script>
// @ is an alias to /src
import MainPage from "@/components/MainPage";
import MenuNav from "@/components/MenuNav";

export default {
  name: 'Home',
  components: {
    MenuNav,
    MainPage
  }
}
</script>
