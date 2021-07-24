<template>
	<div id="index">
		<Header></Header>
		<div class="content">
			<div class="map-part" ref="map">
				<Map ref="world"></Map>
			</div>
			<!-- <News v-show="isShowNews" :key="1" ref="news"></News> -->
			<News v-show="isShowNews" ref="news"></News>
			<Newslist :isShowNews="isShowNews" @showNews="showNews"></Newslist>
		</div>
	</div>
</template>

<script>
import Header from "./Header.vue";
import Map from "./Map.vue";
import Newslist from "./Newslist.vue";
import News from "./News.vue";
import { initWorld } from "./mapUtil";
// import func from "vue-editor-bridge";

export default {
	name: "Index",
	data() {
		return {
			isShowNews: false,
		};
	},
	components: {
		Header,
		Map,
		Newslist,
		News,
	},
	mounted: {},
	updated() {
		initWorld(this.$refs.world);
	},
	mounted() {
		this.$nextTick(function () {
			initWorld(this.$refs.world);
		});
	},
	methods: {
		showNews(val) {
			let myEvent = new Event("resize");

			if (val === true) {
				$(this.$refs.map).css({
					width: "48rem",
				});
				// console.log("00");
				// setTimeout(function () {
				// 	window.dispatchEvent(myEvent);
				// }, 200);
			} else {
				$(this.$refs.map).css({
					width: "76.5625rem",
				});
			}
			this.isShowNews = val;
			setTimeout(function () {
				// window.dispatchEvent(myEvent);
				window.dispatchEvent(myEvent);
				console.log(2);
			}, 500);
		},
	},
};
</script>

<style scoped>
#index {
	background-color: #fffef8;
}

.header {
	height: 10vh;
	background-color: #fffef8;
	box-shadow: 0 0 5px 2px rgba(0, 0, 0, 0.08);
}
.content {
	display: flex;
	width: 100%;
	height: 90vh;
	padding: 0.625rem 0 0 0.625rem;
	box-sizing: border-box;
}
.map-part {
	/* flex: 5; */
	position: relative;
	right: 0;
	float: left;
	width: 76.5625rem;
	height: 100%;
	padding-bottom: 0.625rem;
	border-radius: 0.5rem;
	margin-right: 0.625rem;
	box-sizing: border-box;
	transition: all 0.5s;
}

.list-part {
	position: relative;
	/* top: -0.625rem; */
	float: left;
	width: 18.125rem;
	height: 100%;
	box-shadow: 2px 3px 10px 5px rgba(0, 0, 0, 0.08);
	background-color: #fff;
	border-left: 1px solid #66a9c9;
}

.news-part {
	/* flex: 3; */
	/* display: none; */
	float: left;
	width: 28.5625rem;
	height: 100%;
	padding: 0.625rem;
	box-shadow: -2px -2px 10px 5px rgba(0, 0, 0, 0.08);
	box-sizing: border-box;
	background-color: #fff;
	transition: all 0.5s;
}
</style>