<template>
	<div id="index">
		<Map></Map>
		<div class="news-list"></div>
	</div>
</template>

<script>
import Map from "./Map";

export default {
	name: "Index",
	components: {
		Map,
	},
};
</script>

<style>
#index .map-part {
	width: 60%;
	height: 100%;
	/* background-color: bisque; */
}
</style>