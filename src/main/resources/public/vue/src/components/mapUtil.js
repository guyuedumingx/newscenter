// import echarts from 'echarts'
// Vue.prototype.$echarts = echarts
import echarts from "echarts";
import "echarts/map/js/world.js";
import "echarts/map/js/china.js"
import nameMap from "../common/echarts/country-namemap"

export function initWorld(ele) {
  ele.chart = echarts.init(ele.$refs.world);
  // console.log(chart);
  window.onresize = echarts.init(ele.$refs.world).resize;
  // 把配置和数据放这里
  const option = {
    // backgroundColor: "#2486b970",//"#d8e3e7",
    title: {
      text: 'World\n世界地图',
      x: 'center',
      top: "15px",
      textStyle: {
        fontFamily: 'Arial, Verdana, sans',
        color: "#144a74aa",
        fontSize: "25",
        fontWeight: "700",
        lineHeight: "6",
        opacity: 1,
        // left: '50%'
      },
    },
    tooltip: {  //没有series这个图层就不能使用这个属性
      // show: true,
      trigger: "item",
      formatter: "{b}"
    },
    series: [{
      type: 'map',
      map: "world",
      roam: true,
      // roam: 'scale',
      zoom: 1.25,
      // center:[],
      // silent: true, //好像是静止这个图层的
      label: {
        show: true,
        normal: {
          show: false,
        },
        emphasis: {
          show: true,
          fontSize: "14",
          color: "#000",
          // fontFamily: "STKaiti"
        },
      },
      itemStyle: {
        normal: {
          areaColor: "#fff",
          // borderColor: "#000",
          borderColor: "rgba(0,0,0,0.4)",
          borderWidth: 1, //设置外层边框
          shadowBlur: 3,
          shadowOffsetY: 5,
          shadowOffsetX: 2,
          shadowColor: "rgba(0,0,0,0.6)"
        },
        emphasis: {
          areaColor: "#144a74aa",
          shadowBlur: 5,
          borderWidth: 0,
          shadowColor: "rgba(0, 0, 0, 0.5)",
          borderColor: "#fff"
        },
      },
      nameMap,
    },
    ],
    //#region   geo、serise数据
    // geo: {
    //   map: "world",
    //   roam: true,
    //   // roam: 'scale',
    //   zoom: 1.25,
    //   // center:[],
    //   // silent: true, //好像是静止这个图层的
    //   label: {
    //     show: true,
    //     normal: {
    //       show: false,
    //     },
    //     emphasis: {
    //       show: true,
    //       fontSize: "14",
    //       color: "#000",
    //       // fontFamily: "STKaiti"
    //     },
    //   },
    //   itemStyle: {
    //     normal: {
    //       areaColor: "#fff",
    //       // borderColor: "#000",
    //       borderColor: "rgba(0,0,0,0.4)",
    //       borderWidth: 1, //设置外层边框
    //       shadowBlur: 3,
    //       shadowOffsetY: 5,
    //       shadowOffsetX: 2,
    //       shadowColor: "rgba(0,0,0,0.6)"
    //     },
    //     emphasis: {
    //       areaColor: "#144a74aa",
    //       shadowBlur: 5,
    //       borderWidth: 0,
    //       shadowColor: "rgba(0, 0, 0, 0.5)",
    //       borderColor: "#fff"
    //     },
    //   },
    // },
    // dataRange: {
    //   show: false,
    //   // min: 0,
    //   // max: 1000000,
    //   // text: ["High", "Low"],
    //   realtime: true,
    //   calculable: true,
    //   // color: ["#12a182", "#2bae85", "#9abeaf"],
    // },
    // series: [
    //   {
    //     type: "map",
    //     mapType: "world",
    //     // zoom: 1.2,
    //     mapLocation: {
    //       y: 100,
    //     },
    //     symbolSize: 12,
    //     label: {
    //       show: true,
    //       normal: {
    //         show: false,
    //       },
    //       emphasis: {
    //         show: true,
    //       },
    //     },
    //     itemStyle: {
    //       emphasis: {
    //         borderColor: "#fff",
    //         borderWidth: 1,
    //       },
    //     },
    //   },
    // ],

    //#endregion

  };
  ele.chart.setOption(option);
  ele.chart.on("click", function (params) {
    ele.areaClick = params.name;
  })
}

export function initChina(ele) {
  ele.chart = echarts.init(ele.$refs.world);
  // console.log(chart);
  window.onresize = echarts.init(ele.$refs.world).resize;
  // 把配置和数据放这里
  const option = {
    // backgroundColor: "#e6f3ff",
    title: {
      text: 'China\n中国',
      x: "center",
      top: "15px",
      textStyle: {
        fontFamily: 'Arial, Verdana, sans',
        color: "#144a74aa",
        fontSize: "25",
        fontWeight: "700",
        lineHeight: "6",
        opacity: 1,
      },
    },
    tooltip: {
      trigger: "item",
      formatter: "{b}"
    },
    series: [{
      type: "map",
      map: "china",
      roam: 'scale',// 一定要关闭拖拽
      zoom: 1.1,
      // center: [105, 36], // 调整地图位置 经纬度表示
      label: {
        normal: {
          show: true, //关闭省份名展示
          fontSize: "10",
          color: "#333",
        },
        emphasis: {
          show: true,
          fontSize: "14",
          color: "#000",
        }
      },
      itemStyle: {
        normal: {
          areaColor: "#fbfbfb",
          // borderColor: "#000",
          borderColor: "rgba(0,0,0,0.4)",
          borderWidth: 1, //设置外层边框
          shadowBlur: 5,
          shadowOffsetY: 5,
          shadowOffsetX: 2,
          shadowColor: "rgba(0,0,0,0.6)"
        },
        emphasis: {
          areaColor: "#144a74aa",
          shadowBlur: 5,
          borderWidth: 0,
          shadowColor: "rgba(0, 0, 0, 0.5)",
          borderColor: "#fff"
        }
      }
    },
    ]

    //#region geo series 图层

    // geo: {
    //   map: "china",
    //   roam: 'scale',// 一定要关闭拖拽
    //   // zoom: 1.23,
    //   center: [105, 36], // 调整地图位置 经纬度表示
    //   label: {
    //     normal: {
    //       show: true, //关闭省份名展示
    //     },
    //     emphasis: {
    //       show: true,
    //       fontSize: "10",
    //       color: "rgba(0,0,0,0.7)"
    //     }
    //   },
    //   itemStyle: {
    //     normal: {
    //       areaColor: "#2bae85",
    //       borderColor: "rgba(0,0,0,0.2)",
    //       borderWidth: 1, //设置外层边框
    //       shadowBlur: 5,
    //       shadowOffsetY: 8,
    //       shadowOffsetX: 0,
    //       shadowColor: "#223e36"
    //     },
    //     emphasis: {
    //       areaColor: "#184cff",
    //       // zoom: 2,
    //       shadowBlur: 5,
    //       borderWidth: 0,
    //       shadowColor: "rgba(0, 0, 0, 0.5)"
    //     }
    //   }
    // },

    // series: [
    //   {
    //     type: "map",
    //     map: "china",
    //     roam: true,
    //     // zoom: 1.23,
    //     center: [105, 36],
    //     // geoIndex: 1,
    //     // aspectScale: 0.75, //长宽比
    //     showLegendSymbol: true, // 存在legend时显示
    //     label: {
    //       show: true,
    //       normal: {
    //         show: false,
    //       },
    //       emphasis: {
    //         show: true,
    //         textStyle: {
    //           color: "#fff"
    //         }
    //       }
    //     },
    //     itemStyle: {
    //       normal: {
    //         areaColor: "#0d0059",
    //         borderColor: "#389dff",
    //         borderWidth: 0.5
    //       },
    //       emphasis: {
    //         areaColor: "#17008d",
    //         shadowOffsetX: 0,
    //         shadowOffsetY: 0,
    //         shadowBlur: 5,
    //         borderWidth: 0,
    //         shadowColor: "rgba(0, 0, 0, 0.5)"
    //       }
    //     },
    //   }
    // ]
    //#endregion

  };
  ele.chart.setOption(option);
  ele.chart.on("click", function (param) {
    console.log(param);
  })
}
