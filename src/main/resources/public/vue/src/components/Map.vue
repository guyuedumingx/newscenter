<template>
	<div class="world-map" ref="world" @click="onWhichCountry">
		<!-- <world></world> -->
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
			// map: "world",
			areaClick: "世界",
		};
	},
	mounted() {
		// this.initChart();
		this.$nextTick(() => {
			this.initChart();
		});
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

		onWhichCountry() {
			console.dir(this.areaClick);
			if (this.areaClick === "中国") {
				initChina(this);
			}
		},

		//加载地图
		initChart() {
			// initWorld(this);
			if (this.areaClick === "世界") {
				initWorld(this);
			} else if (this.areaClick === "中国") {
				initChina(this);
			}
		},
	},
};
</script>

<style scoped>
.world-map {
	width: 100%;
	height: 100%;
	border-radius: 0.5rem;
	box-shadow: 0 0 10px 5px rgba(0, 0, 0, 0.08);
	background-color: #2486b970;
}
</style>