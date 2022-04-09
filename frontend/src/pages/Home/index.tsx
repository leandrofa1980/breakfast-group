import { Footer } from "components/Footer";
import { Forms } from "components/Forms";
import { NavBar } from "components/NavBar";

const Home = () => {
  return (
    <>
      <NavBar />
      <div className="container">
        <Forms />
      </div>
      <Footer />
    </>
  );
};

export default Home;
