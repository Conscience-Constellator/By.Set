package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Point_By_Short;
import CC.Util.By.LMNt.Set_Point_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Short;
import CC.$.Q$Q.Short$Point;
import CC.$.Q$Q.Point1$1;
import CC.$.Q_Q$.Short_Point$;
import CC.$.Q_Q$Q.Point2$1;

public interface Set_Point_By_Short<Valu_Typ,From_Typ> extends
	Get_Point_By_Short<Valu_Typ>,
	Set_Q_By_Short<From_Typ>,
	Set_Point_By_Q<Valu_Typ,From_Typ>,
	Short_Point$<Valu_Typ>
{
	@Lin_Dclar void Set_Point_By_Short(short By,Valu_Typ Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Short_Point$(short By,Valu_Typ Valu){Set_Point_By_Short(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point_By_Short_Sorc(short By,Short$Point<Valu_Typ> Sorc){Set_Point_By_Short(By,Sorc.Short$Point(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point1$1_By_Short(short By,Point1$1<Valu_Typ,Valu_Typ> Fun,Valu_Typ Valu)
		{Set_Point_By_Short(By,Fun.Point1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point1$1_By_Short_Sorc(short By,Point1$1<Valu_Typ,Valu_Typ> Fun,Short$Point<Valu_Typ> Sorc)
			{Set_Point1$1_By_Short(By,Fun,Sorc.Short$Point(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point1$1_By_Short(short By,Point1$1<Valu_Typ,Valu_Typ> Fun)
				{Set_Point1$1_By_Short_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point2$1_By_Short(short By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ A,Valu_Typ B)
		{Set_Point_By_Short(By,Fun.Point2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point2$1_By_Short_SLit(short By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Short$Point<Valu_Typ> A,Valu_Typ B)
			{Set_Point2$1_By_Short(By,Fun,A.Short$Point(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point2$1_By_Short(short By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ B)
				{Set_Point2$1_By_Short_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Point2$1_By_Short_Sorc(short By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Short$Point<Valu_Typ> A,Short$Point<Valu_Typ> B)
				{Set_Point2$1_By_Short_SLit(By,Fun,A,B.Short$Point(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Point2$1_By_Short_Sorc(short By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Short$Point<Valu_Typ> B)
					{Set_Point2$1_By_Short_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default Valu_Typ SGet_Point_By_Short(short By,Valu_Typ Valu)
	{
		Valu_Typ Stor=Get_Point_By_Short(By);
		Set_Point_By_Short(By,Valu);

		return Stor;
	}
}