<template>
	<div class="map-part">
		<div class="world-map" ref="world" @click="onWhichCountry">
			<!-- <world></world> -->
		</div>
	</div>
</template>

<script>
// import axios from "axios";
// import echarts from "echarts";
// import "echarts/map/js/world.js";
import { initWorld, initChina } from "./mapUtil.js";

export default {
	name: "Map",
	components: {
		// echarts,
		// world,
	},
	data() {
		return {
			// title: "图表",
			// placeholder: "用户名/电话",
			// find: "2", //1显示新增按钮，2显示导入按钮，若不显示这两个按钮可以写0或者不写值
			chart: null,
			map: "world",
		};
	},
	mounted() {
		this.initChart();
	},
	beforeDestroy() {
		if (!this.chart) {
			return;
		}
		// this.chart.dispose();
		this.chart = null;
	},
	methods: {
		//搜索回调
		searchItem(val) {
			console.log(val);
		},
		//新增回调
		addNew(val) {
			console.log(val);
		},
		//导入
		leadingItem(val) {
			console.log(val);
		},

		onWhichCountry(params) {
			console.dir(this.chart);
		},

		//加载地图
		initChart() {
			initChina(this);
			// initWorld(this);
			// if (this.map === "world") {
			// 	initWorld(this);
			// }
		},
	},
};
</script>

<style>
@import url("../assets/css/base.css");

.world-map {
	width: 1000px;
	height: 600px;
	box-shadow: 0 0 10px 5px rgba(0, 0, 0, 0.08);
	margin-top: 50px;
	margin-left: 50px;
	background-color: #2486b970;
	/* transform: translateX(-50%); */
	/* border: 0.125rem solid saddlebrown; */
	/* background-color: aqua; */
	/* background-color: rgb(148, 185, 255); */
}
</style>