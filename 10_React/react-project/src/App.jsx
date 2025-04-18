import './App.css'
import Hello from './components/Hello';
import Heading from './components/Heading';
import VideoList from './components/VideoList';

const videoDate = [{
  sumbnail : "https://i.ytimg.com/an_webp/zt0QZjaUVJs/mqdefault_6s.webp?du=3000&sqp=CK2wh8AG&rs=AOn4CLCOMsLZoCI-sZlH0WEasyLm0p18qw",
  title: "있잖아 꾸웩 빵빵아 꾸웩",
  logo : "https://yt3.ggpht.com/wYRkjS6E0mMZ-np2jNwjVaCNzQMpxs1VkdQ_p25oe0aaSj0awd7f9xRUcrwI6rVOQE7kjZQ6l4A=s48-c-k-c0x00ffffff-no-rj",
  channelName : "빵빵이의 일상",
  views : '163만',
  date : "1개월 전"
},{
  sumbnail : "https://i.ytimg.com/an_webp/zt0QZjaUVJs/mqdefault_6s.webp?du=3000&sqp=CK2wh8AG&rs=AOn4CLCOMsLZoCI-sZlH0WEasyLm0p18qw",
  title: "있잖아 꾸웩 빵빵아 꾸웩",
  logo : "https://yt3.ggpht.com/wYRkjS6E0mMZ-np2jNwjVaCNzQMpxs1VkdQ_p25oe0aaSj0awd7f9xRUcrwI6rVOQE7kjZQ6l4A=s48-c-k-c0x00ffffff-no-rj",
  channelName : "빵빵이의 일상",
  views : '163만',
  date : "1개월 전"
},{
  sumbnail : "https://i.ytimg.com/an_webp/zt0QZjaUVJs/mqdefault_6s.webp?du=3000&sqp=CK2wh8AG&rs=AOn4CLCOMsLZoCI-sZlH0WEasyLm0p18qw",
  title: "있잖아 꾸웩 빵빵아 꾸웩",
  logo : "https://yt3.ggpht.com/wYRkjS6E0mMZ-np2jNwjVaCNzQMpxs1VkdQ_p25oe0aaSj0awd7f9xRUcrwI6rVOQE7kjZQ6l4A=s48-c-k-c0x00ffffff-no-rj",
  channelName : "빵빵이의 일상",
  views : '163만',
  date : "1개월 전"
},{
  sumbnail : "https://i.ytimg.com/an_webp/juM_qadVY1E/mqdefault_6s.webp?du=3000&sqp=CLa4h8AG&rs=AOn4CLDfjDK86G1GfhXWx0R_1QDHYsGwDw",
  title: "길러준 은혜도 모르고...",
  logo : "https://yt3.ggpht.com/wYRkjS6E0mMZ-np2jNwjVaCNzQMpxs1VkdQ_p25oe0aaSj0awd7f9xRUcrwI6rVOQE7kjZQ6l4A=s48-c-k-c0x00ffffff-no-rj",
  channelName : "빵빵이의 일상",
  views : '262만',
  date : "3개월 전"
}]

function App() {
  return (
    <>
      {/* <Heading type="h2"/>
      <Heading/>
      <Heading>
        무엇을 도와드릴까요?
      </Heading>
      <Hello/> */}
      <VideoList videos={videoDate}/>
    </>
  )
}

export default App
