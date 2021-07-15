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
#app {
	width: 100%;
	height: 1000px;
	background-color: #fffef8;
}
</style>
