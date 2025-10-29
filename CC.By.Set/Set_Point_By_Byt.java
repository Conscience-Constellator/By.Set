package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Point_By_Byt;
import CC.Util.By.LMNt.Set_Point_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Byt;
import CC.$.Q$Q.Byt$Point;
import CC.$.Q$Q.Point1$1;
import CC.$.Q2$.Byt_Point$;
import CC.$.Q_Q$Q.Point2$1;

public interface Set_Point_By_Byt<Valu_Typ,From_Typ> extends
	Get_Point_By_Byt<Valu_Typ>,
	Set_Q_By_Byt<From_Typ>,
	Set_Point_By_Q<Valu_Typ,From_Typ>,
	Byt_Point$<Valu_Typ>
{
	@Lin_Dclar void Set_Point_By_Byt(byte By,Valu_Typ Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Byt_Point$(byte By,Valu_Typ Valu){Set_Point_By_Byt(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point_By_Byt_Sorc(byte By,Byt$Point<Valu_Typ> Sorc){Set_Point_By_Byt(By,Sorc.Byt$Point(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point1$1_By_Byt(byte By,Point1$1<Valu_Typ,Valu_Typ> Fun,Valu_Typ Valu)
		{Set_Point_By_Byt(By,Fun.Point1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point1$1_By_Byt_Sorc(byte By,Point1$1<Valu_Typ,Valu_Typ> Fun,Byt$Point<Valu_Typ> Sorc)
			{Set_Point1$1_By_Byt(By,Fun,Sorc.Byt$Point(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point1$1_By_Byt(byte By,Point1$1<Valu_Typ,Valu_Typ> Fun)
				{Set_Point1$1_By_Byt_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point2$1_By_Byt(byte By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ A,Valu_Typ B)
		{Set_Point_By_Byt(By,Fun.Point2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point2$1_By_Byt_SLit(byte By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Byt$Point<Valu_Typ> A,Valu_Typ B)
			{Set_Point2$1_By_Byt(By,Fun,A.Byt$Point(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point2$1_By_Byt(byte By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ B)
				{Set_Point2$1_By_Byt_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Point2$1_By_Byt_Sorc(byte By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Byt$Point<Valu_Typ> A,Byt$Point<Valu_Typ> B)
				{Set_Point2$1_By_Byt_SLit(By,Fun,A,B.Byt$Point(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Point2$1_By_Byt_Sorc(byte By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Byt$Point<Valu_Typ> B)
					{Set_Point2$1_By_Byt_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default Valu_Typ SGet_Point_By_Byt(byte By,Valu_Typ Valu)
	{
		Valu_Typ Stor=Get_Point_By_Byt(By);
		Set_Point_By_Byt(By,Valu);

		return Stor;
	}
}