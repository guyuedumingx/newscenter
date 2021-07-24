<template>
	<div id="app">
		<Index></Index>
	</div>
</template>

<script>
import Index from "./components/Index";

export default {
	name: "App",
	components: { Index },
};
</script>

<style>
@import url("assets/css/base.css");
</style>

<style scoped>
#app {
	width: 100%;
	height: 100vh;
}
</style>

